async function getQuote() {
    const responseFromServer = await fetch('/quote');
    const textFromResponse = await responseFromServer.text();

    const quoteContainer = document.getElementById('quote-container');
    quoteContainer.innerText=textFromResponse;
}