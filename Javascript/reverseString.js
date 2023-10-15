function reverseStr(str){
    var splitStr = str.split("");
    var revSplit = splitStr.reverse();
    var revStr = revSplit.join("");

    return revStr;
}

function enterStr(str){
    var strArray = str.split(" ");

    var result = "";

    for(var i=0;i<strArray.length;i++){
        var tempResult = reverseStr(strArray[i]);
        if(i == strArray.length-1){
            result = result.concat(tempResult + ".");
        }else{
            result = result.concat(tempResult + " ");
        }
    }

    console.log(result);
}

var s = "This is a demo string";

enterStr(s);