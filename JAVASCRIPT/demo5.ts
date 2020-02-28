class Reactangle{
    length:Number;
     height:Number;

   
    getArea():Number{
        let area = Number(this.length) * Number(this.height)
        return area;
    }
    getParameter(l:any,h:any):any{
        return 2 * (l+h)
    }
}
    var obj = new Reactangle();
    obj.height=10;
    obj.length=20;
    var area = obj.getArea();
    
    console.log(area);