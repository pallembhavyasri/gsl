def call(String projectName) {
    script {
        echo "Starting pipeline for project: ${projectName.toUpperCase()}"
    }
}