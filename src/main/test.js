var time = 1;

function timer(){
    console.log(time);
    time++;

    if (time == 60)
        time = 0;
}

setInterval(timer, 1000);