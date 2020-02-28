import { Component, OnInit } from "@angular/core";

@Component({
  selector: "app-test",
  templateUrl: "./test.component.html",
  styles: ["."]
})
export class TestComponent implements OnInit {
  names = ["Mark", "Paul", "Watson", "Stacy", "Lucy"];
  employees = [];

  constructor() {
    this.employees = [
      { empId: "1", empName: "Mark", age: 20 },
      { empId: "2", empName: "Watson", age: 30 },
      { empId: "3", empName: "Paul", age: 40 }
    ];
  }
  onButtonClicked() {
    this.employees = [
      { empId: "1", empName: "Mark", age: 20 },
      { empId: "2", empName: "Watson", age: 30 },
      { empId: "3", empName: "Paul", age: 40 },
      { empId: "4", empName: "Stacy", age: 50 },
      { empId: "5", empName: "Lucy", age: 30 }
    ];
  }
  trackByEmpId(employee, index) {
    return employee.empId;
  }
  ngOnInit(): void {}
}
