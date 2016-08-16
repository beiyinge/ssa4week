var express = require('express');
var app = express();

app.use(express.static('public'));

app.get('/', function (req, res) {
    res.send('Hello World!');
});

app.listen(3000, function () {
    console.log('Example app listening on port 3000!');
});


var sqlite3 = require('sqlite3').verbose();
var db = new sqlite3.Database('scratch.db');

db.serialize(function() {
	
	var createUserTableSql = "CREATE TABLE USER " +
                   "(USERID 		CHAR(25)	PRIMARY KEY     NOT NULL," +
                   " NAME           CHAR(50)    				NOT NULL, " + 
                   " PASSWORD		CHAR(50)					NOT NULL)"; 

    	var createTweetTableSql = "CREATE TABLE TWEET " +
                "(USERID 		CHAR(25)	NOT NULL," +
                " TWEET         CHAR(140)   NOT NULL, " + 
                " DATE			TEXT		NOT NULL)"; 

    	var createFollowerTableSql = "CREATE TABLE FOLLOWER " +
                "(USERID 		CHAR(25)	NOT NULL," +
                " FOLLOWERID    CHAR(140)   NOT NULL)"; 
	
	db.run(createUserTableSql);
	db.run(createTweetTableSql);
	db.run(createFollowerTableSql);
	
	var insertUserSql = "INSERT INTO USER (USERID, NAME, PASSWORD) " +
	    				 			"VALUES ('shuvo', 	'Shuvo Ahmed',   	'shuvopassword')," +
	    				 				   "('abu',   	'Abu Moinuddin', 	'abupassword')," +
	    				 			       "('charles', 'Charles Walsek', 	'charlespassword')," +
	    				 				   "('beiying', 'Beiying Chen',		'beiyingpassword')," +
	    				 			       "('swarup',  'Swarup Khatri',	'swarup');"; 
	db.prepare(insertUserSql);
	
	// var stmt = db.prepare("INSERT INTO lorem VALUES (?)");
	// for (var i = 0; i < 10; i++) {
	  // stmt.run("Ipsum " + i);
	// }
	// stmt.finalize();

	db.each("SELECT rowid AS id, userid FROM user", function(err, row) {
	  console.log(row.id + ": " + row.info);
	});
});

db.close();
