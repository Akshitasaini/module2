var Reactangle = /** @class */ (function () {
    function Reactangle() {
    }
    Reactangle.prototype.getArea = function () {
        var area = Number(this.length) * Number(this.height);
        return area;
    };
    Reactangle.prototype.getParameter = function (l, h) {
        return 2 * (l + h);
    };
    return Reactangle;
}());
var obj = new Reactangle();
obj.height = 10;
obj.length = 20;
var area = obj.getArea();
console.log(area);
