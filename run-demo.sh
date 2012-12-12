#!/bin/bash

bin=`dirname $0`
bin=`cd "${bin}" && pwd`
cd "${bin}"

dep=$1
if [ -z "$dep" ]; then
  echo "You must run this with one of 'a' or 'b' as an argument,"
  echo "to select a dependency to run with."
  exit 1
fi

# Build everything.
mvn clean install

cd client
# Copy dependency libraries in.
mvn dependency:copy-dependencies -Ddep="$dep"

# Run it.
cd target
exec java -cp client-1.0.0-SNAPSHOT.jar:"dependency/*" client.Client

