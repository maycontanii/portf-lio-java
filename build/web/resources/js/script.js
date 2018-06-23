function edit() {
    var output = document.getElementsByClassName("output-text");
    var input = document.getElementsByClassName("editable");
    output.item(0).style = "display: none";
    output.item(1).style = "display: none";
    output.item(2).style = "display: none";
    input.item(0).style = "display: inherit";
    input.item(1).style = "display: inherit";
    input.item(2).style = "display: inherit";
    input.item(3).style = "display: inherit";
    input.item(4).style = "display: inherit";
}

function noEdit() {
    var output = document.getElementsByClassName("output-text");
    var input = document.getElementsByClassName("editable");
    output.item(0).style = "display: inherit";
    output.item(1).style = "display: inherit";
    output.item(2).style = "display: inherit";
    input.item(0).style = "display: none";
    input.item(1).style = "display: none";
    input.item(2).style = "display: none";
    input.item(3).style = "display: none";
    input.item(4).style = "display: none";
}