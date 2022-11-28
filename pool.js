const mysql = require('mysql2')

const pool = mysql.createPool(
	{
		//Mysql Connection Info
		//rds
		//host="database-1.czoaojx6xbvo.ap-northeast-2.rds.amazonaws.com",
		//ec2 ubuntu
		host : "54.180.215.81",
		port : "3306",
		user : "mysql",
		password : "1234",
		database : "testdb"
	}
)
const promisePool = pool.promise()

module.exports = promissPool;
