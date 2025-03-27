import { Component, OnInit } from '@angular/core';
import { Subject } from '../model/subject';  
import { SubjectService } from '../service/subject.service';  

@Component({
  selector: 'app-subjects',
  templateUrl: './subjects.component.html',
  styleUrls: ['./subjects.component.scss']
})
export class SubjectsComponent implements OnInit {
  displayedColumns: string[] = ['firstName', 'lastName', 'email', 'phone', 'gender', 'city', 'state', 'active'];
  dataSource: Subject[] = [];  

  constructor(private subjectService: SubjectService) {}

  ngOnInit(): void {
    this.getSubjects();
  }

  getSubjects(): void {
    this.subjectService.getSubjects().subscribe(
      (data: Subject[]) => {
        this.dataSource = data;
        console.log(this.dataSource);
      },
      (error) => {
        console.error('Error fetching subjects', error);
      }
    );
  }
}
