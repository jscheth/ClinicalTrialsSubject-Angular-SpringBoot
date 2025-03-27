import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SubjectsComponent } from './subjects/subjects/subjects.component';

@Component({
  selector: 'app-root',
  imports: [
    SubjectsComponent, 
    RouterOutlet, 
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'clinicaltrials';
}

