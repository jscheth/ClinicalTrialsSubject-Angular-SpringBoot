// src/app/subjects/subjects.component.ts
import { Component, Input } from '@angular/core';
import { Subject } from './model/subject.model';
import { SubjectService } from './service/subject.service';

@Component({
  selector: 'app-subjects',
  templateUrl: './subjects.component.html',
  styleUrls: ['./subjects.component.less']
})
export class SubjectsComponent {
  @Input() subjects: Subject[] = [];

  constructor(private subjectService: SubjectService) {}

  // ngOnInit(): void {
  //   this.subjectService.getSubjects().subscribe((data) => {
  //     this.subjects = data;
  //   });
  // }
}
