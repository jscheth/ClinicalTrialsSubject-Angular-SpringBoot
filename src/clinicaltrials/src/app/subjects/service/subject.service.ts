import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Subject } from '../model/subject';

@Injectable({
  providedIn: 'root'
})
export class SubjectService {
  private apiUrl = 'http://localhost:8080/api';

  constructor(private http: HttpClient) { }

getSubjects(): Observable<Subject[]> {
  return this.http.get<Subject[]>(this.apiUrl + `/subjects`);
}
}
