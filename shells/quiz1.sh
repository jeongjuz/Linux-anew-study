#!/bin/bash

a=0
echo -n "Input Woman Age : "
read a
echo -n "Input Man Age : "
read b

if [ $a -gt $b ]; then
	echo old Woman
elif [ $a -eq  $b ]; then
	echo same
else 
	echo old Man
fi
