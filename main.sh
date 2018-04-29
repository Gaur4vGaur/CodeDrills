#!/bin/bash 



if [ $1 == "" ]
  then echo "$1 is null, please provide main class name"
       exit 1
fi

mvn clean compile install
mvn exec:java -Dexec.mainClass=$1

