#UserRestDemo

## Description
Demo application to test c3p0 connection pool settings
Uses rest services

## To test
Use Postman or SoapUI.

Test1: /user/all
GET http://localhost:8034/user/all

Test2: /user/adduser
POST http://localhost:8034/user/adduser
JSON example:
{
	"name": "Knut",
	"salary": 300
}
