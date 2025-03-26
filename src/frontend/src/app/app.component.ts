import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SubjectsComponent } from './subjects/subjects.component';

@Component({
  selector: 'app-root',
  imports: [SubjectsComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.less' 
})
export class AppComponent {
  title = 'frontend';
}
