@import exercise.dto.posts.PostPage
@import exercise.util.NamedRoutes

@param PostPage page

@template.layout.page(
content = @`
    <div>
        <main>
            <div>
                <a>${page.getPost().getName()}</a>
            </div>
            <div>
                <a>${page.getPost().getBody()}</a>
            </div>
            <div>
                <a href="${NamedRoutes.postsPath()}">Back</a>
            </div>
        </main>
    </div>
`
)