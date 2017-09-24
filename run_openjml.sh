#!/usr/bin/env bash

path="src/ex3/Ex3.java"
echo "Testing file: $path"
java -jar /workspace/ssv/software/OpenJML/openjml.jar -verboseness 2 -esc -prover cvc4 -exec /workspace/ssv/software/cvc4/cvc4-1.2-x86_64-linux-opt -no-purityCheck $path