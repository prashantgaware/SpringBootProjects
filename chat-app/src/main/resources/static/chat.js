let stompClient = null;

function connect() {
    const socket = new SockJS('/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, () => {
        stompClient.subscribe('/topic/messages', (message) => {
            showMessage(JSON.parse(message.body));
        });
    });
}

function sendMessage() {
    const messageInput = document.getElementById('message');
    const message = {
        sender: "User",
        content: messageInput.value
    };
    stompClient.send("/app/sendMessage", {}, JSON.stringify(message));
    messageInput.value = '';
}

function showMessage(message) {
    const messagesDiv = document.getElementById('messages');
    const messageElement = document.createElement('div');
    messageElement.textContent = `${message.sender}: ${message.content}`;
    messagesDiv.appendChild(messageElement);
}

document.addEventListener('DOMContentLoaded', connect);
