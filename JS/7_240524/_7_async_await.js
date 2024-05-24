async function message() {
    const hello = await new Promise((resolve) => {
        setTimeout(() => {
            resolve('hello');
        }, 100)
    });

    const world = await new Promise((resolve) => {
        setTimeout(() => {
            resolve('world');
        }, 100)
    });

    console.log(`${hello} ${world}`);
}

message();