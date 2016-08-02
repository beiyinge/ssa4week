

do {
	var human = prompt("Enter 'r', 'p' oor 's':", '');
} while (human !== 'r' && human !== 'p' && human !== 's')

	
var computer = Math.floor(Math.random() * 3);
	
	/* if (computer === 0) {
		computer = 'r';
	}
	
	switch (computer) {
		case 0: computer = 'r';
		break;
		
		case 1: computer= 'p';
		break;
		
		case 2: computer = 's';
		break;
	} */
	
computer = ['r', 'p', 's'][computer];
	
if (human === computer) {
	alert('tie: both players picked ' + computer)
	
}

if (human === 'r') {
	if (computer === 'p') {
		alert('Computer wns!');
	} else if (computer === 's') {
		alert('Human wins');
	}
} else if (human === 'p') {
	if (computer === 'r') {
		alert('Human wns!');
	} else if (computer === 's') {
		alert('Computer wins');
	}
} else if (human === 's') {
	if (computer === 'p') {
		alert('Human wns!');
	} else if (computer === 'r') {
		alert('Computer wins');
	}
}



