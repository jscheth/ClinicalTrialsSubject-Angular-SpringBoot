import { Component } from '@angular/core';
import { SubjectsComponent } from './subjects/subjects.component';
import { HttpClientModule } from '@angular/common/http';

@Component({
  selector: 'app-root',
  standalone: true, 
  imports: [SubjectsComponent, HttpClientModule],  
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less'], 
})
export class AppComponent {
  title = 'frontend';
}
