#!/bin/bash

VALID_PASSWORD=password123
echo "Enter the password: "
read USER_PASSWORD

if [ "$VALID_PASSWORD" == "$USER_PASSWORD" ]; then
	echo "You have Access"
else
	echo "ACCESS DENIED"
fi