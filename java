#!/usr/bin/bash
if [ $# -eq 2 ]; then
    cd $2
    ecj .
    dx --dex --output="$1.dex" *.class
    chmod 444 $1.dex
    dalvikvm -cp "$1.dex" "$1"
    rm -rf *.dex *.class oat
else
    echo "Please pass the class name and then the directory containing the java file(s)."
    echo "java <ClassName> <directory>"
    echo ""
fi
