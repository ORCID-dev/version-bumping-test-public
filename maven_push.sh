#!/usr/bin/env bash

export GITHUB_TOKEN=$GITHUB_PACKAGES_PAT

mvn --settings settings.xml \
    -DaltReleaseDeploymentRepository=github::${ARTIFACT_URL}${ARTIFACT_REPO_PATH} \
    --batch-mode deploy
