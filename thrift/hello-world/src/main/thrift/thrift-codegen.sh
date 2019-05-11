#!/usr/bin/env bash

rm -rf ./gen-java
rm -rf ./../java/com/aries/learn/thrift/helloworld/contract/*
thrift -gen java dto.thrift
thrift -gen java service.thrift
mv gen-java/com/aries/learn/thrift/helloworld/contract/dto ../java/com/aries/learn/thrift/helloworld/contract/dto
mv gen-java/com/aries/learn/thrift/helloworld/contract/service ../java/com/aries/learn/thrift/helloworld/contract/service
rm -rf ./gen-java
