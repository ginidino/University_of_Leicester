#!/bin/bash

FILENAME=$1

sort -t";" -k1 $FILENAME > ALPHA_$FILENAME
sort -t";" -h -k2  $FILENAME > SIZE_$FILENAME
sort -t";" -M -k3  $FILENAME > DATE_$FILENAME
sort -t";" -n -k4  $FILENAME > VALUE_$FILENAME
