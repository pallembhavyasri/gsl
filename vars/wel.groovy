def call(String projectName) {
    script {
        echo "welcome to: ${projectName.toUpperCase()}"
    }
}


def call(Map stageParams) {

    checkout([
        $class: 'GitSCM',
        branches: [[name:  stageParams.branch ]],
        userRemoteConfigs: [[ url: stageParams.url ]]
    ])
  }