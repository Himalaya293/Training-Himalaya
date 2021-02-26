import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-department-list',
template: `
  <p>
    Frontend Developer<br>
    Backend Developer<br>
    Tester<br>
  </p>
`,
styles: [
]
})
export class DepartmentListComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
