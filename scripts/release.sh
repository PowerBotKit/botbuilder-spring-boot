#!/usr/bin/env bash

set -Eeuo pipefail

version=$1

if test -z "$version"
then
    exit;
fi

echo "release new version: "$version

echo "{\n\t\"name\": \"botbuilder-spring-boot\",\n\t\"version\":\"${version}\"\n}" > package.json

npx conventional-changelog -p angular -i CHANGELOG.md -s

mvn versions:set -DnewVersion=$version

rm -r -f package.json

git add CHANGELOG.md
git add pom.xml
git add **/pom.xml

git commit -m "chore(release): v${version}"
git tag v${version}

rm -r -f package.json
rm -r -f pom.xml.versionsBackup
rm -r -f **/pom.xml.versionsBackup

