async function getQuote() {
    const responseFromServer = await fetch('/quote');
    const jsonFromResponse = await responseFromServer.json();

    const quoteContainer = document.getElementById('quote-container');
    quoteContainer.innerText= jsonFromResponse[Math.floor(Math.random()*3)];
    
}