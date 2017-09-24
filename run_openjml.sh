#!/usr/bin/env bash

path="src/test/Test.java"
echo "Testing file: $path"
java -jar /workspace/ssv/software/OpenJML/openjml.jar -verboseness 2 -esc -prover yices2 -exec /workspace/ssv/software/yices-2.5.2/bin/yices -no-purityCheck $path