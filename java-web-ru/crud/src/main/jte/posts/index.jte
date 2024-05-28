@import exercise.dto.posts.PostsPage
@import exercise.util.NamedRoutes

@param PostsPage page

@template.layout.page(
    content = @`
        <div>
            <main>
                @for(var post : page.getPosts())
                    <div>
                        <a href="${NamedRoutes.postPath(post.getId())}">${post.getName()}</a>
                    </div>
                @endfor
                <div>
                    <a href="${NamedRoutes.postsPath()}/?page=${page.getCurrentPage() - 1}">page ${page.getCurrentPage() - 1}</a>
                    <a href="${NamedRoutes.postsPath()}/?page=${page.getCurrentPage() + 1}">page ${page.getCurrentPage() + 1}</a>
                </div>
            </main>
        </div>
    `
)