var Employee = /** @class */ (function () {
    /*firstName:String;
    lastName:String;
    salary:Number;
    gender:String;
    email:String;
    constructor(f:String,l:String,s:Number,g:String,e:String){
        this.firstName=f;
        this.lastName=l;
        this.salary=s;
        this.gender=g;
        this.email=e;
    }*/
    function Employee(firstName, lastName, salary, gender, email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.gender = gender;
        this.email = email;
    }
    Employee.prototype.getFullName = function () {
        console.log(this.firstName + " " + this.lastName + " " + this.salary + " " + this.gender + " " + this.email);
    };
    return Employee;
}());
var emp = new Employee("AKSHITA", "SAINI", 10000, "FEMALE", "AKSHITA@gmail.com");
emp.getFullName();
