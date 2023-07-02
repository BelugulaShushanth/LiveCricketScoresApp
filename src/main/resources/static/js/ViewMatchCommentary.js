window.onload = () => {
    activateDeactivateNavBtns();
    adjustCards();
}
function activateDeactivateNavBtns(){
    let live = document.getElementById("live");
    let recent = document.getElementById("recent");
    let upcoming = document.getElementById("upcoming");
    live.classList.remove("activateNavBtn");
    live.classList.add("deactivateNavBtn")

    recent.classList.remove("activateNavBtn");
    recent.classList.add("deactivateNavBtn")

    upcoming.classList.remove("activateNavBtn");
    upcoming.classList.add("deactivateNavBtn");
}

function adjustCards(){
    let width = screen.width;
    let scores = document.getElementsByClassName("scores")[0];
    let keystats = document.getElementsByClassName("keystats")[0];
    if(width<=1000){
        scores.classList.add("col-md-12");
        scores.classList.add("col-sm-12");

        keystats.classList.add("col-md-12");
        keystats.classList.add("col-sm-12");
    }
    else{
        scores.classList.remove("col-md-12");
        scores.classList.remove("col-sm-12");

        keystats.classList.remove("col-md-12");
        keystats.classList.remove("col-sm-12");
    }
}