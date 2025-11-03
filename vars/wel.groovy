def call(String projectName) {
    script {
        echo "welcome to: ${projectName.toUpperCase()}"
    }
}