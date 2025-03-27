import { Routes } from '@angular/router';
import { SubjectsComponent } from './subjects/subjects/subjects.component';

export const routes: Routes = [
  { path: 'subjects', component: SubjectsComponent },
//   { path: '', redirectTo: '/subjects', pathMatch: 'full' },
//   { path: '**', redirectTo: '/subjects' }
];