function edit() {
    var output = document.getElementsByClassName("output-text");
    var input = document.getElementsByClassName("editavel");
    output.item(0).style = "display: none";
    output.item(1).style = "display: none";
    input.item(0).style = "display: inherit";
}

function noEdit() {
    var output = document.getElementsByClassName("output-text");
    var input = document.getElementsByClassName("editavel");
    output.item(0).style = "display: inherit";
    output.item(1).style = "display: inherit";
    input.item(0).style = "display: none";
}