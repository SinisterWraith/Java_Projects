for(let x = 1; x <=100; x++)
{
    let output = "";

    if(x % 3 == 0 && x % 5 == 0)
        console.log(output += "fizzbuzz");
    else if(x % 3 == 0)
        console.log(output += "fizz");
    else if(x % 5 == 0)
        console.log(output += "buzz");        
    else if(x % 7 == 0)
        console.log(output += "bazz");
    else
        console.log(x)
}