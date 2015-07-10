#!/bin/sh
#

# exit in case of failure
set -x -e

# Verify that we dont have anything to commit and change to master
git diff --quiet || exit 1
git checkout master

[ ! -f demo/pom.xml ] && exit 2

# Run script to generate pom and java stuff
rm -rf pom.xml src node_modules pom.xml.releaseBackup release.properties target
npm install

# Compile demo using compiled library
(cd demo && mvn clean package)


# Save application
( cd demo/target/gwt-polymer-demo/ && \
  tar cf /tmp/demo.tar demo.* gwt* img )

# Switch to gh-pages and update demo compiled app
git checkout gh-pages

( cd demo && \
  rm -rf gwt* && \
  tar xf /tmp/demo.tar )

# Create an index
cp demo/demo.html demo/index.html

exit

# Commit changes
git add demo/gwt* 
git commit -m 'Update demo' demo
git push origin gh-pages

# Return to original branch
git checkout scripts
