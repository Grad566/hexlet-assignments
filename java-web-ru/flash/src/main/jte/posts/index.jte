@import exercise.dto.posts.PostsPage

@import exercise.dto.posts.PostsPage
@param PostsPage page


@template.layout.page(
    content = @`
        <div>
            <table>
                @for(var post : page.getPosts())
                    <tr>
                        <td>${post.getName()}</td>
                        <td>${post.getBody()}</td>
                    </tr>
                @endfor
            </table>
        </div>
    `
)