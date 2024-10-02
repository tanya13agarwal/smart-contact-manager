console.log("Script loaded");

// change theme

// step 1
let currentTheme = getTheme();
//initially, theme set ho jayega -->
document.addEventListener("DOMContentLoaded", () => {
  changeTheme();
});

// step 2
function changeTheme() {
  //set to web page

  changePageTheme(currentTheme, "");
  //set the listener to change theme button
  const changeThemeButton = document.querySelector("#theme_change_button");

  changeThemeButton.addEventListener("click", (event) => {
    let oldTheme = currentTheme;
    console.log("change theme button clicked");
    if (currentTheme === "dark") {
      //theme ko light kro
      currentTheme = "light";
    } else {
      //theme ko dark kro
      currentTheme = "dark";
    }
    console.log(currentTheme);
    changePageTheme(currentTheme, oldTheme);
  });
}

// step 3
//set theme to localstorage
function setTheme(theme) {
  localStorage.setItem("theme", theme);
}

// step 4
//get theme from localstorage
function getTheme() {
  let theme = localStorage.getItem("theme");
  // if theme is null, return by default light theme
  return theme ? theme : "light";
}

// step 5
//change current page theme
function changePageTheme(theme, oldTheme) {
  //localstorage mein update karenge
  setTheme(currentTheme);
  //remove the current theme

  if (oldTheme) {
    document.querySelector("html").classList.remove(oldTheme);
  }
  //set the current theme
  document.querySelector("html").classList.add(theme);

  // change the text of button
  document
    .querySelector("#theme_change_button")
    .querySelector("span").textContent = theme == "light" ? "Dark" : "Light";
}

//change page change theme