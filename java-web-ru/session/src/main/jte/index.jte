@import exercise.dto.MainPage
@import exercise.util.NamedRoutes
@param MainPage page

@template.layout.page(
    content = @`
        @if(page.getName() != null)
            <div>
                <a>Hello ${page.getName().toString()}</a>
            </div>
            <div>
                <form action="${NamedRoutes.logoutPath()}" method="post">
                    <button type="submit">Выйти</button>
                </form>
            </div>
        @else
            <div>
                <a>Hello user</a>
            </div>
            <div>
                <a href="${NamedRoutes.buildSessionPath()}">Войти</a>
            </div>

        @endif
    `
)
