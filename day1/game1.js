while (true) {
	var user = prompt('Please enter rock, paper, or scissors:');

	var shapes = ["rock", "paper", "scissors"]; 

	var result = '';

function isValid() {
	
	for (i=0; i<3; i++) {
		if (user.toLowerCase() === shapes[i]) {
			alert('Validation: Match ' + shapes[i]);
			return true;
		}
	}	
	
	return false;
}

	// if valid, randomly get computer's selection
	// Display winner or tie
	if (isValid()) {
		var computer = Math.floor(Math.random() * 3);
		alert('computer='+shapes[computer]);

		if (computer === 0 ) {		
			if (user.toLowerCase() === 'rock') {
				result = 'It\'s a tie';
			} else if (user.toLowerCase() === 'paper') {
				result = 'You win';
			} else if (user.toLowerCase() === 'scissors') {
				result = 'You lose';
			}	
		}

		if (computer === 1 ) {
			if (user.toLowerCase() === 'rock') {
				result = 'You lose';
			} else if (user.toLowerCase() === 'paper') {
				result = 'It\'s a tie';
			} else if (user.toLowerCase() === 'scissors') {
				result = 'You win';
			}	
		}

		if (computer === 2 ) {
			if (user.toLowerCase() === 'rock') {
				result = 'You win';
			} else if (user.toLowerCase() === 'paper') {
				result = 'You lose';
			} else if (user.toLowerCase() === 'scissors') {
				result = 'It\'s a tie';
			}	
		}
		
		alert(result);
	}else {
		alert('You entered wrong shape');

	}
}

