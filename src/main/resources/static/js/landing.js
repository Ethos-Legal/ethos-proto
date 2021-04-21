'use strict'

function landingButtonHandler1() {
    const button = document.getElementById("signInForm");

    if(button.style.display === "none") {
        button.style.display = "block";
    } else {
        button.style.display = "none";
    }
    console.log("hidden")
}

function landingButtonHandler2() {
    const button = document.getElementById("signInForm2");

    if(button.style.display === "none") {
        button.style.display = "block";
    } else {
        button.style.display = "none";
    }
    console.log("hidden2")
}