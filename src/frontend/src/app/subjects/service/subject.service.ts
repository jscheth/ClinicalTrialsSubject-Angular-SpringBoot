import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Subject } from '../model/subject.model';

@Injectable({
  providedIn: 'root',
})
export class SubjectService {
//   private apiUrl = 'http://localhost:8080/api/subjects';

//   constructor(private http: HttpClient) {}

//   getSubjects(): Observable<Subject[]> {
//     return this.http.get<Subject[]>(this.apiUrl);
//   }
}