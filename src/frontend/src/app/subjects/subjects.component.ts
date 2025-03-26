import { Component } from '@angular/core';
import { SubjectService } from './service/subject.service';
import { Subject } from './model/subject.model';
import { CommonModule } from '@angular/common';
import { MatTableModule } from '@angular/material/table';

@Component({
  selector: 'app-subjects',
  imports: [CommonModule, MatTableModule],
  templateUrl: './subjects.component.html',
  styleUrl: './subjects.component.less'
})
export class SubjectsComponent {
  subjects: Subject[] = [];
  displayedColumns: string[] = ['id', 'firstName', 'lastName']

  constructor(private subjectService: SubjectService) {}

  ngOnInit(): void {
    this.subjectService.getSubjects().subscribe((data) => {
      this.subjects = data;
    });
  }

}
