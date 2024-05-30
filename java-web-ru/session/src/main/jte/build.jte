@import exercise.dto.LoginPage
@import exercise.util.NamedRoutes
@param LoginPage page

@template.layout.page(
    content = @`
    @if(page != null)
        <div>
            <a>${page.getError()}</a>
        </div>

    @endif
    <form action="${NamedRoutes.loginPath()}" method="post">
        <label>
            Enter your name
            <input type="text" placeholder="Name" name="name" />
        </label>
        <label>
            Enter password
            <input type="password" placeholder="password" name="password" />
        </label>
        <input type="submit" />
    </form>
    `
)