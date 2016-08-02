function domPrompt(msg){	
	var div = document.createElement('div');
	div.innerHTML = msg;
	div.onclick = function(evt) {
		alert('click');
		
	}
	document.body.appendChild(div);
}


function domAlert(msg) {
	var div = document.createElement('div');
	div.innerHTML = msg;
	div.setAttribute('class', 'alert_class');
	document.body.appendChild(div);
}


var human;

var promptInput = document.getElementById("promptInput");
promptInput.onkeydown = function(evt) {
	if (evt.key === "Enter") {		
		human = promptInput.value;
		
		if (human === 'r' || human === 'p' || human === 's') {
			computerWinner(human);
		}
	}
}


// domPrompt("demo prompt");

// domAlert("demo alert");


// do {
	// var human = prompt("Enter 'r', 'p' oor 's':", '');
// } while (human !== 'r' && human !== 'p' && human !== 's')


function computerWinner(human) {	
	var computer = Math.floor(Math.random() * 3);
		
	computer = ['r', 'p', 's'][computer];
		
	if (human === computer) {
		domAlert('tie: both players picked ' + computer)
		
	}

	if (human === 'r') {
		if (computer === 'p') {
			domAlert('Computer wins!');
		} else if (computer === 's') {
			domAlert('Human wins!');
		}
	} else if (human === 'p') {
		if (computer === 'r') {
			domAlert('Human wins!');
		} else if (computer === 's') {
			domAlert('Computer wins!');
		}
	} else if (human === 's') {
		if (computer === 'p') {
			domAlert('Human wins!');
		} else if (computer === 'r') {
			domAlert('Computer wins!');
		}
	}
}