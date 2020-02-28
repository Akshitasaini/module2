export class Employee{
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
constructor(
    public firstName:String,
    public lastName:String,
    public salary:Number,
    public gender:String,
    public email:String
    ){}


getFullName() {
    console.log(this.firstName + " "+this.lastName +  " "+this.salary + " "+this.gender + " "+this.email)
}
}
let emp = new Employee("AKSHITA","SAINI",10000,"FEMALE","AKSHITA@gmail.com");
emp.getFullName();


