def call(String status, String customMessage = '') {
    // Define Slack color codes based on build status
    def colorCode = '#439FE0' // Default: blue

    if (status == 'success') {
        colorCode = 'good' // green
    } else if (status == 'failure') {
        colorCode = 'danger' // red
    } else if (status == 'unstable') {
        colorCode = 'warning' // yellow
    }

    def defaultMsg = "${env.JOB_NAME} - Build #${env.BUILD_NUMBER} - ${status.toUpperCase()} \n ${env.BUILD_URL}"

