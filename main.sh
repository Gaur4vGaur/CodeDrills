#!/bin/bash 



if [ $1 == "" ]
  then echo "$1 is null, please provide main class name"
       exit 1
fi

mvn compile install
mvn exec:java -Dexec.mainClass=$1

read -n1 -r -p "Press any key to continue..." key

