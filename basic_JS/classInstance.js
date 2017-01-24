
/**
 * Created by jkcd on 24/01/17.
 *
 *
 *
 * Write a Person class with an instance variable age , and a constructor that takes an integer,
 * initialAge, as a parameter. The constructor must assign  initialAge to  age after confirming the argument passed as
 * initialAge is not negative; if a negative argument is passed as initialAge, the constructor should set age  to 0 and
 * print 'Age is not valid, setting age to 0'..
 * In addition, you must write the following instance methods:
 * 1) yearPasses() should increase the age instance variable by 1.
 * 2) amIOld() should perform the following conditional actions:
 * - If age < 13 , print You are young..
 * - If age>= 13 and age < 18, print You are a teenager..
 * - Otherwise, print You are old..
 *
 */


function Person(initialAge){
    if ( initialAge >= 0 ){
        this.age = initialAge;
    }
    else
    {
        console.log('Age is not valid, settng age to 0');
        this.age = 0;
    }
    this.yearPasses =  function(){
        this.age++;
    };
    this.amIOld = function(){
        if( this.age < 13){
            console.log('You are young.');
        }
        else if ( this.age >= 13 && this.age < 18 ){
            console.log('You are a teenager.');
        }
        else{
            console.log('You are old.');
        }
    };

}

var ageLess = new Person(-2);
ageLess.amIOld();
console.log('-----');

var age10 = new Person(10);
age10.amIOld();
console.log('-----');

var age17 = new Person(17);
age17.amIOld();
age17.yearPasses();
age17.amIOld();
console.log('-----');

var age20 = new Person(20);
age20.amIOld();

